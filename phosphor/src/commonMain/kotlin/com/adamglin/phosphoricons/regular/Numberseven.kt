package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Numberseven: ImageVector
    get() {
        if (_numberseven != null) {
            return _numberseven!!
        }
        _numberseven = Builder(name = "Numberseven", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.66f, 50.3f)
                lineToRelative(-48.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.32f, -4.6f)
                lineTo(157.25f, 56.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.66f, 10.3f)
                close()
            }
        }
        .build()
        return _numberseven!!
    }

private var _numberseven: ImageVector? = null
