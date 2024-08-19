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

public val DuotoneGroup.`Map-pin-simple-line-duotone`: ImageVector
    get() {
        if (`_map-pin-simple-line-duotone` != null) {
            return `_map-pin-simple-line-duotone`!!
        }
        `_map-pin-simple-line-duotone` = Builder(name = "Map-pin-simple-line-duotone", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 208.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(135.42f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(88.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 88.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_map-pin-simple-line-duotone`!!
    }

private var `_map-pin-simple-line-duotone`: ImageVector? = null
