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

public val LightGroup.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) {
            return _pawPrint!!
        }
        _pawPrint = Builder(name = "PawPrint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 82.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 212.0f, 82.0f)
                close()
                moveTo(212.0f, 122.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 212.0f, 122.0f)
                close()
                moveTo(70.0f, 108.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 70.0f, 108.0f)
                close()
                moveTo(44.0f, 122.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 44.0f, 122.0f)
                close()
                moveTo(92.0f, 86.0f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 66.0f, 60.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 92.0f, 86.0f)
                close()
                moveTo(92.0f, 46.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 78.0f, 60.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 92.0f, 46.0f)
                close()
                moveTo(164.0f, 86.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 86.0f)
                close()
                moveTo(164.0f, 46.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 46.0f)
                close()
                moveTo(186.15f, 150.61f)
                arcToRelative(37.32f, 37.32f, 0.0f, false, true, -17.82f, -22.33f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -80.66f, 0.0f)
                arcTo(37.26f, 37.26f, 0.0f, false, true, 69.9f, 150.58f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 88.0f, 222.0f)
                arcToRelative(37.58f, 37.58f, 0.0f, false, false, 14.76f, -3.0f)
                arcToRelative(66.14f, 66.14f, 0.0f, false, true, 50.41f, 0.0f)
                arcTo(37.66f, 37.66f, 0.0f, false, false, 168.0f, 222.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 18.15f, -71.39f)
                close()
                moveTo(168.0f, 210.0f)
                arcToRelative(25.93f, 25.93f, 0.0f, false, true, -10.21f, -2.08f)
                arcToRelative(78.15f, 78.15f, 0.0f, false, false, -59.65f, 0.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 75.68f, 161.1f)
                arcToRelative(49.28f, 49.28f, 0.0f, false, false, 23.51f, -29.48f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 57.62f, 0.0f)
                arcToRelative(49.27f, 49.27f, 0.0f, false, false, 23.57f, 29.5f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 168.0f, 210.0f)
                close()
            }
        }
        .build()
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
