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

public val FillGroup.`Handshake-fill`: ImageVector
    get() {
        if (`_handshake-fill` != null) {
            return `_handshake-fill`!!
        }
        `_handshake-fill` = Builder(name = "Handshake-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.3f, 107.91f)
                lineTo(228.78f, 56.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.47f, -7.15f)
                lineTo(182.44f, 62.13f)
                lineTo(130.05f, 48.27f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, -4.1f, 0.0f)
                lineTo(73.56f, 62.13f)
                lineTo(48.69f, 49.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.47f, 7.15f)
                lineTo(1.7f, 107.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.15f, 21.47f)
                lineToRelative(27.0f, 13.51f)
                lineToRelative(55.49f, 39.63f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, false, 2.71f, 1.25f)
                lineToRelative(64.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.6f, -2.1f)
                lineToRelative(40.0f, -40.0f)
                lineToRelative(15.08f, -15.08f)
                lineToRelative(26.42f, -13.21f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.15f, -21.46f)
                close()
                moveTo(199.41f, 141.28f)
                lineTo(165.0f, 113.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.68f, 0.61f)
                curveTo(136.51f, 132.27f, 116.66f, 130.0f, 104.0f, 122.0f)
                lineTo(147.24f, 80.0f)
                horizontalLineToRelative(31.81f)
                lineToRelative(27.21f, 54.41f)
                close()
                moveTo(157.54f, 183.14f)
                lineTo(99.42f, 168.61f)
                lineToRelative(-49.2f, -35.14f)
                lineToRelative(28.0f, -56.0f)
                lineTo(128.0f, 64.28f)
                lineToRelative(9.8f, 2.59f)
                lineToRelative(-45.0f, 43.68f)
                lineToRelative(-0.08f, 0.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 2.72f, 24.81f)
                curveToRelative(20.56f, 13.13f, 45.37f, 11.0f, 64.91f, -5.0f)
                lineTo(188.0f, 152.66f)
                close()
                moveTo(131.82f, 217.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.75f, 6.06f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -1.95f, -0.24f)
                lineTo(80.41f, 213.33f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, true, -2.71f, -1.25f)
                lineTo(51.35f, 193.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.3f, -13.0f)
                lineToRelative(25.11f, 17.94f)
                lineTo(126.0f, 208.24f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 131.82f, 217.94f)
                close()
            }
        }
        .build()
        return `_handshake-fill`!!
    }

private var `_handshake-fill`: ImageVector? = null
