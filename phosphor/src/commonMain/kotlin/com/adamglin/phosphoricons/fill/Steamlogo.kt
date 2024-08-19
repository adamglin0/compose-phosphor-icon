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

public val FillGroup.Steamlogo: ImageVector
    get() {
        if (_steamlogo != null) {
            return _steamlogo!!
        }
        _steamlogo = Builder(name = "Steamlogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.92f, 132.11f)
                curveToRelative(-2.09f, 54.0f, -45.83f, 97.72f, -99.81f, 99.81f)
                arcTo(104.06f, 104.06f, 0.0f, false, true, 25.6f, 109.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.77f, -2.08f)
                lineToRelative(43.0f, 43.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 42.42f, 34.92f)
                lineToRelative(61.1f, -49.84f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -50.71f, -50.65f)
                lineToRelative(-43.0f, 52.74f)
                lineTo(35.0f, 87.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.76f, -4.6f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, 197.7f, 49.0f)
                close()
                moveTo(121.58f, 118.55f)
                lineTo(90.77f, 156.33f)
                arcTo(11.83f, 11.83f, 0.0f, false, false, 88.0f, 163.19f)
                arcTo(12.19f, 12.19f, 0.0f, false, false, 99.85f, 176.0f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, false, 7.78f, -2.74f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(37.78f, -30.81f)
                arcTo(36.18f, 36.18f, 0.0f, false, true, 121.58f, 118.55f)
                close()
                moveTo(175.9f, 110.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 158.0f, 127.9f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 175.9f, 110.0f)
                close()
            }
        }
        .build()
        return _steamlogo!!
    }

private var _steamlogo: ImageVector? = null
