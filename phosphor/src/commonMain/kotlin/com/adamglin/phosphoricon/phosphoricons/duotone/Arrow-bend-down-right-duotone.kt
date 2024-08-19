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

public val DuotoneGroup.`Arrow-bend-down-right-duotone`: ImageVector
    get() {
        if (`_arrow-bend-down-right-duotone` != null) {
            return `_arrow-bend-down-right-duotone`!!
        }
        `_arrow-bend-down-right-duotone` = Builder(name = "Arrow-bend-down-right-duotone",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 152.0f)
                lineToRelative(-48.0f, 48.0f)
                verticalLineTo(104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 146.34f)
                lineToRelative(-48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 104.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(128.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 40.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 160.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 229.66f, 146.34f)
                close()
                moveTo(184.0f, 180.69f)
                verticalLineTo(123.31f)
                lineTo(212.69f, 152.0f)
                close()
            }
        }
        .build()
        return `_arrow-bend-down-right-duotone`!!
    }

private var `_arrow-bend-down-right-duotone`: ImageVector? = null
