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

public val FillGroup.`Basketball-fill`: ImageVector
    get() {
        if (`_basketball-fill` != null) {
            return `_basketball-fill`!!
        }
        `_basketball-fill` = Builder(name = "Basketball-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.6f, 46.39f)
                arcToRelative(103.48f, 103.48f, 0.0f, false, true, 52.0f, -21.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.45f, 4.0f)
                lineTo(120.05f, 120.0f)
                lineTo(95.7f, 120.0f)
                arcTo(103.77f, 103.77f, 0.0f, false, false, 63.38f, 52.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 63.6f, 46.39f)
                close()
                moveTo(46.0f, 64.07f)
                arcToRelative(103.51f, 103.51f, 0.0f, false, false, -21.29f, 51.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.47f)
                lineTo(79.63f, 120.0f)
                arcTo(87.86f, 87.86f, 0.0f, false, false, 51.89f, 63.59f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 46.0f, 64.07f)
                close()
                moveTo(192.4f, 46.39f)
                arcToRelative(103.48f, 103.48f, 0.0f, false, false, -52.0f, -21.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.45f, 4.0f)
                lineTo(135.95f, 120.0f)
                horizontalLineToRelative(24.3f)
                arcToRelative(103.77f, 103.77f, 0.0f, false, true, 32.32f, -67.56f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.4f, 46.39f)
                close()
                moveTo(231.26f, 115.53f)
                arcTo(103.51f, 103.51f, 0.0f, false, false, 210.0f, 64.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.86f, -0.48f)
                arcTo(87.86f, 87.86f, 0.0f, false, false, 176.37f, 120.0f)
                horizontalLineToRelative(50.91f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 231.26f, 115.53f)
                close()
                moveTo(24.74f, 140.47f)
                arcTo(103.51f, 103.51f, 0.0f, false, false, 46.0f, 191.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.86f, 0.48f)
                arcTo(87.86f, 87.86f, 0.0f, false, false, 79.63f, 136.0f)
                lineTo(28.72f, 136.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.74f, 140.47f)
                close()
                moveTo(210.0f, 191.93f)
                arcToRelative(103.51f, 103.51f, 0.0f, false, false, 21.29f, -51.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.47f)
                lineTo(176.37f, 136.0f)
                arcToRelative(87.86f, 87.86f, 0.0f, false, false, 27.74f, 56.41f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.0f, 191.93f)
                close()
                moveTo(63.6f, 209.61f)
                arcToRelative(103.48f, 103.48f, 0.0f, false, false, 52.0f, 21.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.45f, -4.0f)
                lineTo(120.05f, 136.0f)
                lineTo(95.7f, 136.0f)
                arcToRelative(103.77f, 103.77f, 0.0f, false, true, -32.32f, 67.56f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 63.6f, 209.61f)
                close()
                moveTo(160.3f, 136.0f)
                lineTo(136.0f, 136.0f)
                verticalLineToRelative(91.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.45f, 4.0f)
                arcToRelative(103.48f, 103.48f, 0.0f, false, false, 52.0f, -21.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.22f, -6.05f)
                arcTo(103.77f, 103.77f, 0.0f, false, true, 160.3f, 136.0f)
                close()
            }
        }
        .build()
        return `_basketball-fill`!!
    }

private var `_basketball-fill`: ImageVector? = null
