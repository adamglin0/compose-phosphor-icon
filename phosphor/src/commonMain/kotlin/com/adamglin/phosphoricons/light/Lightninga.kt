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

public val LightGroup.LightningA: ImageVector
    get() {
        if (_lightningA != null) {
            return _lightningA!!
        }
        _lightningA = Builder(name = "LightningA", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.88f, 111.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.42f, -4.27f)
                lineTo(119.0f, 84.56f)
                lineTo(133.0f, 25.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.24f, -5.47f)
                lineTo(27.6f, 122.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.94f, 9.55f)
                lineTo(81.0f, 155.44f)
                lineTo(67.0f, 214.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 6.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.22f, -1.22f)
                lineToRelative(95.2f, -102.85f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 173.88f, 111.94f)
                close()
                moveTo(83.88f, 195.15f)
                lineTo(93.8f, 153.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.38f, -6.86f)
                lineTo(42.08f, 124.8f)
                lineToRelative(74.0f, -80.0f)
                lineToRelative(-9.92f, 41.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.38f, 6.86f)
                lineToRelative(48.38f, 21.73f)
                close()
                moveTo(237.32f, 213.31f)
                lineTo(201.32f, 141.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineToRelative(-36.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.74f, 5.37f)
                lineTo(175.71f, 198.0f)
                horizontalLineToRelative(40.58f)
                lineToRelative(10.34f, 20.68f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 222.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.68f, -0.64f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 237.36f, 213.31f)
                close()
                moveTo(181.71f, 186.0f)
                lineTo(196.0f, 157.42f)
                lineTo(210.29f, 186.0f)
                close()
            }
        }
        .build()
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
