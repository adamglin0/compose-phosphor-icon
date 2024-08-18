package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 116.0f)
                close()
                moveTo(223.8f, 85.38f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 144.0f, 160.0f)
                lineTo(112.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(120.0f, 200.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 232.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 96.0f, 72.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(128.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 11.8f, 53.38f)
                close()
                moveTo(50.8f, 197.29f)
                lineTo(84.02f, 173.56f)
                curveToRelative(0.0f, -0.51f, 0.0f, -1.0f, 0.0f, -1.56f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 1.0f, -7.48f)
                lineTo(33.0f, 140.87f)
                arcToRelative(63.74f, 63.74f, 0.0f, false, false, 17.84f, 56.42f)
                close()
                moveTo(89.8f, 189.09f)
                lineTo(64.12f, 207.46f)
                arcTo(63.6f, 63.6f, 0.0f, false, false, 96.0f, 216.0f)
                horizontalLineToRelative(8.0f)
                lineTo(104.0f, 198.83f)
                arcTo(28.13f, 28.13f, 0.0f, false, true, 89.84f, 189.09f)
                close()
                moveTo(104.0f, 145.17f)
                lineTo(104.0f, 88.0f)
                lineTo(96.0f, 88.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -58.22f, 37.48f)
                lineToRelative(55.87f, 25.39f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 104.0f, 145.17f)
                close()
                moveTo(207.5f, 88.0f)
                lineTo(120.0f, 88.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(24.0f)
                arcTo(64.09f, 64.09f, 0.0f, false, false, 207.5f, 88.0f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
