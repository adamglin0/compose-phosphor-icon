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

public val LightGroup.Dotssix: ImageVector
    get() {
        if (_dotssix != null) {
            return _dotssix!!
        }
        _dotssix = Builder(name = "Dotssix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.0f, 92.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 60.0f, 82.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 70.0f, 92.0f)
                close()
                moveTo(128.0f, 82.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(196.0f, 102.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 196.0f, 102.0f)
                close()
                moveTo(60.0f, 154.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 60.0f, 154.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(196.0f, 154.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 196.0f, 154.0f)
                close()
            }
        }
        .build()
        return _dotssix!!
    }

private var _dotssix: ImageVector? = null