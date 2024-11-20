package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) {
            return _personSimpleThrow!!
        }
        _personSimpleThrow = Builder(name = "PersonSimpleThrow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(52.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 96.0f)
                close()
                moveTo(219.12f, 108.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.62f, 0.62f)
                curveToRelative(-1.2f, -0.94f, -26.41f, -20.11f, -65.7f, 1.3f)
                curveToRelative(0.0f, 0.28f, 0.0f, 0.54f, 0.0f, 0.84f)
                arcToRelative(210.61f, 210.61f, 0.0f, false, true, -3.43f, 33.54f)
                lineToRelative(34.23f, 28.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.23f, 4.33f)
                lineToRelative(-16.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 228.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -1.26f, -0.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.53f, -5.06f)
                lineToRelative(15.13f, -45.41f)
                lineToRelative(-29.0f, -24.13f)
                arcTo(138.23f, 138.23f, 0.0f, false, true, 135.81f, 173.0f)
                curveToRelative(-13.26f, 31.58f, -37.0f, 52.71f, -70.66f, 62.8f)
                arcTo(3.82f, 3.82f, 0.0f, false, true, 64.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.15f, -7.83f)
                curveToRelative(69.32f, -20.8f, 75.54f, -86.09f, 76.74f, -113.21f)
                lineToRelative(-1.34f, 0.9f)
                curveTo(109.24f, 135.58f, 86.78f, 140.0f, 72.42f, 140.0f)
                curveToRelative(-11.24f, 0.0f, -17.51f, -2.73f, -18.08f, -3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.32f, -7.28f)
                curveToRelative(0.25f, 0.11f, 28.44f, 11.87f, 76.09f, -20.52f)
                curveToRelative(25.89f, -17.6f, 47.41f, -18.6f, 60.91f, -16.34f)
                curveToRelative(14.86f, 2.48f, 23.48f, 9.29f, 23.84f, 9.58f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.12f, 108.1f)
                close()
            }
        }
        .build()
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
