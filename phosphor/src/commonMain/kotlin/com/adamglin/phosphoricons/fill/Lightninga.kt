package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.LightningA: ImageVector
    get() {
        if (_lightningA != null) {
            return _lightningA!!
        }
        _lightningA = Builder(name = "LightningA", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.87f, 118.58f)
                lineTo(78.67f, 221.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 65.0f, 214.15f)
                lineToRelative(13.67f, -57.56f)
                lineToRelative(-50.0f, -22.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.59f, -12.73f)
                lineToRelative(95.2f, -102.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 135.0f, 25.85f)
                lineTo(121.31f, 83.41f)
                lineToRelative(50.0f, 22.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.59f, 12.74f)
                close()
                moveTo(235.58f, 223.15f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 232.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -4.42f)
                lineTo(215.05f, 200.0f)
                lineTo(176.94f, 200.0f)
                lineToRelative(-9.79f, 19.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.31f, -7.16f)
                lineToRelative(36.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.31f, 0.0f)
                lineToRelative(36.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 235.58f, 223.15f)
                close()
                moveTo(207.05f, 184.0f)
                lineTo(196.0f, 161.89f)
                lineTo(184.94f, 184.0f)
                close()
            }
        }
        .build()
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
