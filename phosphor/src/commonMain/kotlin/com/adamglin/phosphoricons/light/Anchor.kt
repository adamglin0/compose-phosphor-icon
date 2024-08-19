package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                curveToRelative(0.0f, 26.09f, -15.0f, 31.52f, -39.58f, 38.21f)
                curveTo(158.0f, 185.6f, 143.79f, 189.47f, 134.0f, 199.16f)
                verticalLineTo(126.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(85.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineTo(114.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(73.16f)
                curveToRelative(-9.79f, -9.69f, -24.0f, -13.56f, -36.42f, -16.95f)
                curveTo(61.0f, 175.52f, 46.0f, 170.09f, 46.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                curveToRelative(0.0f, 36.58f, 26.85f, 43.91f, 48.42f, 49.79f)
                curveTo(107.0f, 200.48f, 122.0f, 205.91f, 122.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                curveToRelative(0.0f, -26.09f, 15.0f, -31.52f, 39.58f, -38.21f)
                curveTo(195.15f, 187.91f, 222.0f, 180.58f, 222.0f, 144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 138.0f)
                close()
                moveTo(110.0f, 56.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 110.0f, 56.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
