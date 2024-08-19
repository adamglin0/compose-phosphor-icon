package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Arrow-arc-left-duotone`: ImageVector
    get() {
        if (`_arrow-arc-left-duotone` != null) {
            return `_arrow-arc-left-duotone`!!
        }
        `_arrow-arc-left-duotone` = Builder(name = "Arrow-arc-left-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 152.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 110.46f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -145.4f, -1.63f)
                lineTo(29.66f, 82.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 88.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineTo(67.47f, 120.16f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(103.33f, 103.33f, 0.0f, false, false, 201.54f, 110.46f)
                close()
                moveTo(32.0f, 144.0f)
                verticalLineTo(107.31f)
                lineTo(68.69f, 144.0f)
                close()
            }
        }
        .build()
        return `_arrow-arc-left-duotone`!!
    }

private var `_arrow-arc-left-duotone`: ImageVector? = null
