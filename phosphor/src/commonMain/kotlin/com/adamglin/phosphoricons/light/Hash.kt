package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Hash: ImageVector
    get() {
        if (_hash != null) {
            return _hash!!
        }
        _hash = Builder(name = "Hash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 90.0f)
                lineTo(173.0f, 90.0f)
                lineToRelative(8.89f, -48.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.8f, -2.14f)
                lineTo(160.81f, 90.0f)
                lineTo(109.0f, 90.0f)
                lineToRelative(8.89f, -48.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.8f, -2.14f)
                lineTo(96.81f, 90.0f)
                lineTo(48.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(94.63f, 102.0f)
                lineToRelative(-9.46f, 52.0f)
                lineTo(32.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(83.0f, 166.0f)
                lineTo(74.1f, 214.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.83f, 7.0f)
                arcTo(5.64f, 5.64f, 0.0f, false, false, 80.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.89f, -4.93f)
                lineTo(95.19f, 166.0f)
                lineTo(147.0f, 166.0f)
                lineToRelative(-8.89f, 48.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.83f, 7.0f)
                arcToRelative(5.64f, 5.64f, 0.0f, false, false, 1.08f, 0.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.89f, -4.93f)
                lineTo(159.19f, 166.0f)
                lineTo(208.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(161.37f, 154.0f)
                lineToRelative(9.46f, -52.0f)
                lineTo(224.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(149.17f, 154.0f)
                lineTo(97.37f, 154.0f)
                lineToRelative(9.46f, -52.0f)
                horizontalLineToRelative(51.8f)
                close()
            }
        }
        .build()
        return _hash!!
    }

private var _hash: ImageVector? = null
