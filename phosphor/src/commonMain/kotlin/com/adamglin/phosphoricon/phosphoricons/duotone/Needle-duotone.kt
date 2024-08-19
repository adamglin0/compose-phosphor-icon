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

public val DuotoneGroup.`Needle-duotone`: ImageVector
    get() {
        if (`_needle-duotone` != null) {
            return `_needle-duotone`!!
        }
        `_needle-duotone` = Builder(name = "Needle-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(206.63f, 94.63f)
                lineToRelative(-24.0f, 24.0f)
                curveTo(128.0f, 128.0f, 40.0f, 216.0f, 40.0f, 216.0f)
                reflectiveCurveToRelative(88.0f, -88.0f, 97.37f, -142.63f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.26f, 45.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.66f, 66.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(16.0f, -16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 189.66f, 66.34f)
                close()
                moveTo(224.0f, 72.0f)
                arcToRelative(39.71f, 39.71f, 0.0f, false, true, -11.72f, 28.28f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.3f, 2.23f)
                curveToRelative(-51.49f, 8.84f, -137.46f, 94.28f, -138.32f, 95.15f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                horizontalLineToRelative(0.0f)
                curveTo(36.0f, 208.73f, 120.69f, 123.28f, 129.49f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.23f, -4.3f)
                lineToRelative(24.0f, -24.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 224.0f, 72.0f)
                close()
                moveTo(208.0f, 72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.0f, -17.0f)
                lineTo(144.77f, 77.29f)
                curveToRelative(-4.41f, 21.15f, -18.9f, 46.19f, -35.49f, 69.43f)
                curveToRelative(23.24f, -16.59f, 48.28f, -31.08f, 69.43f, -35.49f)
                lineTo(201.0f, 89.0f)
                arcTo(23.85f, 23.85f, 0.0f, false, false, 208.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_needle-duotone`!!
    }

private var `_needle-duotone`: ImageVector? = null
