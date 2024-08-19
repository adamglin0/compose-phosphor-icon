package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Steeringwheel: ImageVector
    get() {
        if (_steeringwheel != null) {
            return _steeringwheel!!
        }
        _steeringwheel = Builder(name = "Steeringwheel", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 144.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(165.55f, 156.0f)
                horizontalLineToRelative(41.63f)
                curveToRelative(0.79f, -2.21f, 1.49f, -4.47f, 2.09f, -6.76f)
                arcToRelative(116.0f, 116.0f, 0.0f, false, false, -162.54f, 0.0f)
                quadToRelative(0.9f, 3.44f, 2.09f, 6.76f)
                lineTo(90.45f, 156.0f)
                arcToRelative(20.07f, 20.07f, 0.0f, false, true, 18.73f, 13.0f)
                lineToRelative(16.06f, 42.93f)
                curveToRelative(0.92f, 0.0f, 1.83f, 0.07f, 2.76f, 0.07f)
                reflectiveCurveToRelative(1.82f, 0.0f, 2.72f, -0.07f)
                lineToRelative(16.1f, -43.0f)
                arcTo(20.09f, 20.09f, 0.0f, false, true, 165.55f, 156.0f)
                close()
                moveTo(44.41f, 119.73f)
                arcToRelative(139.85f, 139.85f, 0.0f, false, true, 167.18f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -167.18f, 0.0f)
                close()
                moveTo(97.49f, 206.24f)
                lineTo(87.68f, 180.0f)
                lineTo(62.1f, 180.0f)
                arcTo(84.46f, 84.46f, 0.0f, false, false, 97.49f, 206.24f)
                close()
                moveTo(193.9f, 180.0f)
                lineTo(168.32f, 180.0f)
                lineToRelative(-9.84f, 26.25f)
                arcTo(84.35f, 84.35f, 0.0f, false, false, 193.9f, 180.0f)
                close()
            }
        }
        .build()
        return _steeringwheel!!
    }

private var _steeringwheel: ImageVector? = null
