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

public val FillGroup.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) {
            return _pawPrint!!
        }
        _pawPrint = Builder(name = "PawPrint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 108.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 240.0f, 108.0f)
                close()
                moveTo(72.0f, 108.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 72.0f, 108.0f)
                close()
                moveTo(92.0f, 88.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 64.0f, 60.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 92.0f, 88.0f)
                close()
                moveTo(164.0f, 88.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 164.0f, 88.0f)
                close()
                moveTo(187.12f, 148.86f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, true, -16.87f, -21.14f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -84.5f, 0.0f)
                arcTo(35.25f, 35.25f, 0.0f, false, true, 69.0f, 148.82f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 88.0f, 224.0f)
                arcToRelative(39.48f, 39.48f, 0.0f, false, false, 15.52f, -3.13f)
                arcToRelative(64.09f, 64.09f, 0.0f, false, true, 48.87f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 34.73f, -72.0f)
                close()
            }
        }
        .build()
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
