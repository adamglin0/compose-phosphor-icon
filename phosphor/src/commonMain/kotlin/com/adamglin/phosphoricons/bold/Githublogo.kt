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

public val BoldGroup.Githublogo: ImageVector
    get() {
        if (_githublogo != null) {
            return _githublogo!!
        }
        _githublogo = Builder(name = "Githublogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.62f, 75.17f)
                arcTo(63.7f, 63.7f, 0.0f, false, false, 206.39f, 26.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 20.0f)
                arcToRelative(63.71f, 63.71f, 0.0f, false, false, -50.0f, 24.0f)
                horizontalLineTo(126.0f)
                arcTo(63.71f, 63.71f, 0.0f, false, false, 76.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.39f, 6.0f)
                arcToRelative(63.7f, 63.7f, 0.0f, false, false, -6.23f, 49.17f)
                arcTo(61.5f, 61.5f, 0.0f, false, false, 52.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, false, 45.76f, 58.28f)
                arcTo(43.66f, 43.66f, 0.0f, false, false, 92.0f, 192.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineTo(92.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(43.66f, 43.66f, 0.0f, false, false, -5.76f, -21.72f)
                arcTo(60.1f, 60.1f, 0.0f, false, false, 220.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcTo(61.5f, 61.5f, 0.0f, false, false, 212.62f, 75.17f)
                close()
                moveTo(196.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                horizontalLineTo(112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(37.87f, 37.87f, 0.0f, false, true, 6.13f, -20.12f)
                arcToRelative(11.65f, 11.65f, 0.0f, false, false, 1.58f, -11.49f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, true, -0.4f, -27.72f)
                arcToRelative(39.87f, 39.87f, 0.0f, false, true, 26.41f, 17.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 119.82f, 68.0f)
                horizontalLineToRelative(32.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.11f, -5.53f)
                arcToRelative(39.84f, 39.84f, 0.0f, false, true, 26.41f, -17.8f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, true, -0.4f, 27.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.61f, 11.53f)
                arcTo(37.85f, 37.85f, 0.0f, false, true, 196.0f, 104.0f)
                close()
            }
        }
        .build()
        return _githublogo!!
    }

private var _githublogo: ImageVector? = null
