package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Asclepius-fill`: ImageVector
    get() {
        if (`_asclepius-fill` != null) {
            return `_asclepius-fill`!!
        }
        `_asclepius-fill` = Builder(name = "Asclepius-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 128.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(11.62f)
                arcTo(12.25f, 12.25f, 0.0f, false, false, 160.0f, 188.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.93f, -10.87f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -2.06f, -3.49f)
                verticalLineToRelative(-8.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.25f, -3.81f)
                arcTo(28.06f, 28.06f, 0.0f, false, true, 176.0f, 187.71f)
                curveToRelative(0.16f, 15.56f, -13.0f, 28.29f, -28.59f, 28.29f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 96.27f, 200.0f)
                horizontalLineTo(120.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(104.46f)
                curveToRelative(-8.6f, 0.0f, -16.0f, 6.6f, -16.44f, 15.19f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.87f, 16.51f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 3.11f, 3.89f)
                verticalLineTo(172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.87f)
                curveTo(64.47f, 119.48f, 81.0f, 104.0f, 100.68f, 104.0f)
                horizontalLineTo(120.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.81f)
                curveTo(183.56f, 78.6f, 176.14f, 72.0f, 167.54f, 72.0f)
                horizontalLineTo(156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(15.22f)
                curveToRelative(24.62f, 0.0f, 45.2f, 20.15f, 44.77f, 44.76f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 128.0f)
                close()
                moveTo(92.66f, 72.0f)
                horizontalLineTo(100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(64.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 92.66f, 72.0f)
                close()
            }
        }
        .build()
        return `_asclepius-fill`!!
    }

private var `_asclepius-fill`: ImageVector? = null
