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

public val ThinGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                curveToRelative(0.0f, 28.94f, -19.0f, 34.13f, -41.05f, 40.14f)
                curveToRelative(-14.29f, 3.9f, -29.82f, 8.14f, -38.95f, 20.24f)
                verticalLineTo(124.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(83.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineTo(116.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(80.38f)
                curveToRelative(-9.13f, -12.1f, -24.66f, -16.34f, -38.95f, -20.24f)
                curveToRelative(-22.0f, -6.0f, -41.0f, -11.2f, -41.0f, -40.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                curveToRelative(0.0f, 35.06f, 24.94f, 41.86f, 47.0f, 47.86f)
                reflectiveCurveTo(124.0f, 203.06f, 124.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                curveToRelative(0.0f, -28.94f, 19.0f, -34.13f, 41.05f, -40.14f)
                reflectiveCurveTo(220.0f, 179.06f, 220.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 140.0f)
                close()
                moveTo(108.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 56.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
