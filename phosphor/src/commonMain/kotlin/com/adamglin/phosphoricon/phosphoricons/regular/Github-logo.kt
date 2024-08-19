package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Github-logo`: ImageVector
    get() {
        if (`_github-logo` != null) {
            return `_github-logo`!!
        }
        `_github-logo` = Builder(name = "Github-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.31f, 75.68f)
                arcTo(59.78f, 59.78f, 0.0f, false, false, 202.93f, 28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 196.0f, 24.0f)
                arcToRelative(59.75f, 59.75f, 0.0f, false, false, -48.0f, 24.0f)
                horizontalLineTo(124.0f)
                arcTo(59.75f, 59.75f, 0.0f, false, false, 76.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.93f, 4.0f)
                arcToRelative(59.78f, 59.78f, 0.0f, false, false, -5.38f, 47.68f)
                arcTo(58.14f, 58.14f, 0.0f, false, false, 56.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 48.44f, 55.47f)
                arcTo(39.8f, 39.8f, 0.0f, false, false, 96.0f, 192.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 8.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, false, -8.44f, -24.53f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 216.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcTo(58.14f, 58.14f, 0.0f, false, false, 208.31f, 75.68f)
                close()
                moveTo(200.0f, 112.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(112.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(41.74f, 41.74f, 0.0f, false, true, 6.9f, -22.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 73.83f)
                arcToRelative(43.81f, 43.81f, 0.0f, false, true, 0.79f, -33.58f)
                arcToRelative(43.88f, 43.88f, 0.0f, false, true, 32.32f, 20.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 119.82f, 64.0f)
                horizontalLineToRelative(32.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.74f, -3.69f)
                arcToRelative(43.87f, 43.87f, 0.0f, false, true, 32.32f, -20.06f)
                arcTo(43.81f, 43.81f, 0.0f, false, true, 192.0f, 73.83f)
                arcToRelative(8.09f, 8.09f, 0.0f, false, false, 1.0f, 7.65f)
                arcTo(41.72f, 41.72f, 0.0f, false, true, 200.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_github-logo`!!
    }

private var `_github-logo`: ImageVector? = null
