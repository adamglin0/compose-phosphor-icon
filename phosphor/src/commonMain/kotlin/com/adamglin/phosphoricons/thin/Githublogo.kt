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

public val ThinGroup.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) {
            return _githubLogo!!
        }
        _githubLogo = Builder(name = "GithubLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.94f, 76.16f)
                arcTo(55.73f, 55.73f, 0.0f, false, false, 199.46f, 30.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 196.0f, 28.0f)
                arcToRelative(55.78f, 55.78f, 0.0f, false, false, -46.0f, 24.0f)
                horizontalLineTo(122.0f)
                arcTo(55.78f, 55.78f, 0.0f, false, false, 76.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.46f, 2.0f)
                arcToRelative(55.73f, 55.73f, 0.0f, false, false, -4.48f, 46.16f)
                arcTo(53.78f, 53.78f, 0.0f, false, false, 60.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineToRelative(1.41f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 100.0f, 192.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 8.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -13.41f, -28.0f)
                horizontalLineTo(160.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f)
                verticalLineToRelative(-8.0f)
                arcTo(53.78f, 53.78f, 0.0f, false, false, 203.94f, 76.16f)
                close()
                moveTo(204.0f, 112.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                horizontalLineTo(112.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(45.76f, 45.76f, 0.0f, false, true, 7.71f, -24.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.53f, -3.84f)
                arcToRelative(47.82f, 47.82f, 0.0f, false, true, 2.1f, -39.21f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, true, 38.12f, 22.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 119.83f, 60.0f)
                horizontalLineToRelative(32.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.37f, -1.84f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, true, 38.12f, -22.1f)
                arcToRelative(47.82f, 47.82f, 0.0f, false, true, 2.1f, 39.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.53f, 3.83f)
                arcTo(45.85f, 45.85f, 0.0f, false, true, 204.0f, 104.0f)
                close()
            }
        }
        .build()
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
