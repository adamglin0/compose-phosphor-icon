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

public val BoldGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.0f, 16.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 54.29f, 26.32f, 87.22f, 48.4f, 105.29f)
                curveToRelative(23.71f, 19.39f, 47.44f, 26.0f, 48.44f, 26.29f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.32f, 0.0f)
                curveToRelative(1.35f, -0.37f, 30.0f, -8.42f, 55.86f, -32.82f)
                lineToRelative(12.1f, 13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(128.0f, 219.38f)
                arcToRelative(126.38f, 126.38f, 0.0f, false, true, -37.09f, -21.23f)
                curveTo(65.09f, 176.69f, 52.0f, 147.71f, 52.0f, 112.0f)
                verticalLineTo(62.24f)
                lineTo(170.87f, 193.0f)
                arcTo(126.0f, 126.0f, 0.0f, false, true, 128.0f, 219.38f)
                close()
                moveTo(228.0f, 56.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, true, -8.23f, 49.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.28f, 7.92f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, true, -4.08f, -0.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.2f, -15.37f)
                arcTo(120.31f, 120.31f, 0.0f, false, false, 204.0f, 112.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(109.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                horizontalLineTo(208.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
