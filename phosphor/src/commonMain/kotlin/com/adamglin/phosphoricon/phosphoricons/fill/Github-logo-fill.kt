package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Github-logo-fill`: ImageVector
    get() {
        if (`_github-logo-fill` != null) {
            return `_github-logo-fill`!!
        }
        `_github-logo-fill` = Builder(name = "Github-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -48.44f, 55.47f)
                arcTo(39.8f, 39.8f, 0.0f, false, true, 176.0f, 192.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 8.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, 8.44f, -24.53f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 56.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(58.14f, 58.14f, 0.0f, false, true, 7.69f, -28.32f)
                arcTo(59.78f, 59.78f, 0.0f, false, true, 69.07f, 28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 24.0f)
                arcToRelative(59.75f, 59.75f, 0.0f, false, true, 48.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(59.75f, 59.75f, 0.0f, false, true, 48.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.93f, 4.0f)
                arcToRelative(59.74f, 59.74f, 0.0f, false, true, 5.37f, 47.68f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 216.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_github-logo-fill`!!
    }

private var `_github-logo-fill`: ImageVector? = null
