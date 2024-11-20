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

public val ThinGroup.Vignette: ImageVector
    get() {
        if (_vignette != null) {
            return _vignette!!
        }
        _vignette = Builder(name = "Vignette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(128.0f, 76.0f)
                curveToRelative(-37.5f, 0.0f, -68.0f, 23.33f, -68.0f, 52.0f)
                reflectiveCurveToRelative(30.5f, 52.0f, 68.0f, 52.0f)
                reflectiveCurveToRelative(68.0f, -23.33f, 68.0f, -52.0f)
                reflectiveCurveTo(165.5f, 76.0f, 128.0f, 76.0f)
                close()
                moveTo(128.0f, 172.0f)
                curveToRelative(-33.08f, 0.0f, -60.0f, -19.74f, -60.0f, -44.0f)
                reflectiveCurveToRelative(26.92f, -44.0f, 60.0f, -44.0f)
                reflectiveCurveToRelative(60.0f, 19.74f, 60.0f, 44.0f)
                reflectiveCurveTo(161.08f, 172.0f, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return _vignette!!
    }

private var _vignette: ImageVector? = null
