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

public val FillGroup.`Arrows-clockwise-fill`: ImageVector
    get() {
        if (`_arrows-clockwise-fill` != null) {
            return `_arrows-clockwise-fill`!!
        }
        `_arrows-clockwise-fill` = Builder(name = "Arrows-clockwise-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineTo(180.65f, 72.0f)
                arcToRelative(79.48f, 79.48f, 0.0f, false, false, -54.72f, -22.09f)
                horizontalLineToRelative(-0.45f)
                arcTo(79.52f, 79.52f, 0.0f, false, false, 69.59f, 72.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 58.41f, 61.27f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 192.0f, 60.7f)
                lineToRelative(18.36f, -18.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(186.41f, 183.29f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 75.35f, 184.0f)
                lineToRelative(18.31f, -18.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 152.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineTo(64.0f, 195.3f)
                arcToRelative(95.42f, 95.42f, 0.0f, false, false, 66.0f, 26.76f)
                horizontalLineToRelative(0.53f)
                arcToRelative(95.36f, 95.36f, 0.0f, false, false, 67.07f, -27.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.18f, -11.44f)
                close()
            }
        }
        .build()
        return `_arrows-clockwise-fill`!!
    }

private var `_arrows-clockwise-fill`: ImageVector? = null
