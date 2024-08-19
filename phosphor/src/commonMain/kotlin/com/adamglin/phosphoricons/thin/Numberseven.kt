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

public val ThinGroup.Numberseven: ImageVector
    get() {
        if (_numberseven != null) {
            return _numberseven!!
        }
        _numberseven = Builder(name = "Numberseven", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.83f, 49.15f)
                lineToRelative(-48.0f, 160.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 212.0f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, -1.15f, -0.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.68f, -5.0f)
                lineTo(162.62f, 52.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.83f, 5.15f)
                close()
            }
        }
        .build()
        return _numberseven!!
    }

private var _numberseven: ImageVector? = null
