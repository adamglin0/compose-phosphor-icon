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

public val FillGroup.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) {
            return _personSimpleThrow!!
        }
        _personSimpleThrow = Builder(name = "PersonSimpleThrow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 56.0f)
                close()
                moveTo(221.0f, 99.36f)
                curveToRelative(-1.5f, -1.2f, -37.22f, -29.0f, -89.51f, 6.57f)
                curveTo(86.0f, 136.84f, 59.57f, 126.23f, 59.32f, 126.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -6.63f, 14.56f)
                curveToRelative(0.61f, 0.28f, 7.49f, 3.27f, 19.67f, 3.27f)
                curveToRelative(14.21f, 0.0f, 35.64f, -4.11f, 62.77f, -21.29f)
                curveToRelative(-2.28f, 29.41f, -12.73f, 83.47f, -73.43f, 101.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 4.6f, 15.32f)
                curveToRelative(34.83f, -10.45f, 59.45f, -32.34f, 73.2f, -65.08f)
                arcToRelative(141.86f, 141.86f, 0.0f, false, false, 5.1f, -14.33f)
                lineToRelative(22.08f, 18.4f)
                lineToRelative(-14.27f, 42.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.18f, 5.06f)
                lineToRelative(16.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.47f, -8.68f)
                lineToRelative(-32.42f, -27.0f)
                arcToRelative(215.91f, 215.91f, 0.0f, false, false, 3.0f, -30.34f)
                curveToRelative(36.18f, -18.57f, 59.0f, -0.85f, 59.28f, -0.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.0f, -12.48f)
                close()
                moveTo(64.0f, 112.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 48.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 112.0f)
                close()
            }
        }
        .build()
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
