package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 160.0f)
                close()
                moveTo(211.83f, 195.79f)
                arcTo(44.06f, 44.06f, 0.0f, false, true, 168.0f, 236.0f)
                lineTo(144.0f, 236.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(100.0f, 147.85f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 44.0f, 88.0f)
                lineTo(44.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(72.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(52.0f, 44.0f)
                lineTo(52.0f, 88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.69f, 52.0f)
                curveTo(133.0f, 139.63f, 156.0f, 115.93f, 156.0f, 87.17f)
                lineTo(156.0f, 44.0f)
                lineTo(136.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(164.0f, 87.17f)
                curveToRelative(0.0f, 32.0f, -24.84f, 58.59f, -56.0f, 60.69f)
                lineTo(108.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, false, 35.8f, -32.25f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 8.0f, 0.0f)
                close()
                moveTo(236.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 236.0f, 160.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
