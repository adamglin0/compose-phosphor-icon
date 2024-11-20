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

public val LightGroup.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 34.0f)
                lineTo(152.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.76f, 2.34f)
                lineToRelative(-65.39f, 85.0f)
                lineTo(70.6f, 110.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(38.1f, 122.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.81f)
                horizontalLineToRelative(0.0f)
                lineTo(59.51f, 164.0f)
                lineTo(30.1f, 193.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f)
                lineToRelative(12.69f, 12.69f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineTo(92.0f, 196.5f)
                lineToRelative(21.4f, 21.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(12.7f, -12.69f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.81f)
                lineToRelative(-11.25f, -11.25f)
                lineToRelative(85.0f, -65.39f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 104.0f)
                lineTo(222.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 34.0f)
                close()
                moveTo(54.1f, 217.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineTo(38.59f, 204.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f)
                lineTo(68.0f, 172.5f)
                lineTo(83.51f, 188.0f)
                close()
                moveTo(137.41f, 196.72f)
                lineTo(124.72f, 209.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.84f, 0.0f)
                lineToRelative(-75.29f, -75.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineToRelative(12.69f, -12.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f)
                lineToRelative(75.29f, 75.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 137.41f, 196.72f)
                close()
                moveTo(210.0f, 101.05f)
                lineTo(126.09f, 165.6f)
                lineTo(112.49f, 152.0f)
                lineToRelative(51.75f, -51.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(104.0f, 143.51f)
                lineToRelative(-13.6f, -13.6f)
                lineTo(155.0f, 46.0f)
                lineTo(210.0f, 46.0f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
