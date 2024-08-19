package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Phone-transfer-thin`: ImageVector
    get() {
        if (`_phone-transfer-thin` != null) {
            return `_phone-transfer-thin`!!
        }
        `_phone-transfer-thin` = Builder(name = "Phone-transfer-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(62.34f)
                lineTo(181.17f, 42.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(206.34f, 76.0f)
                lineTo(144.0f, 76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 72.0f)
                close()
                moveTo(219.91f, 182.58f)
                arcTo(52.26f, 52.26f, 0.0f, false, true, 168.0f, 228.0f)
                curveTo(90.8f, 228.0f, 28.0f, 165.2f, 28.0f, 88.0f)
                arcTo(52.26f, 52.26f, 0.0f, false, true, 73.42f, 36.09f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 85.9f, 43.28f)
                lineTo(107.0f, 90.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.0f, 11.36f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -0.29f, 0.38f)
                lineTo(84.56f, 127.37f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.18f, 3.69f)
                curveToRelative(7.83f, 16.05f, 24.65f, 32.73f, 40.89f, 40.57f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.7f, -0.21f)
                lineTo(153.8f, 150.3f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, true, 0.37f, -0.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 165.56f, 149.0f)
                lineToRelative(47.22f, 21.16f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 219.91f, 182.58f)
                close()
                moveTo(209.56f, 177.46f)
                lineTo(162.35f, 156.3f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.57f, 0.27f)
                lineTo(134.0f, 177.69f)
                lineToRelative(-0.37f, 0.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.79f, 0.87f)
                curveToRelative(-18.0f, -8.69f, -35.91f, -26.48f, -44.6f, -44.27f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 78.0f, 122.82f)
                lineToRelative(0.29f, -0.39f)
                lineToRelative(21.19f, -25.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.23f, -3.6f)
                lineTo(78.57f, 46.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 74.9f, 44.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -0.48f, 0.0f)
                arcTo(44.23f, 44.23f, 0.0f, false, false, 36.0f, 88.0f)
                arcTo(132.14f, 132.14f, 0.0f, false, false, 168.0f, 220.0f)
                arcToRelative(44.23f, 44.23f, 0.0f, false, false, 44.0f, -38.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 209.56f, 177.46f)
                close()
            }
        }
        .build()
        return `_phone-transfer-thin`!!
    }

private var `_phone-transfer-thin`: ImageVector? = null
