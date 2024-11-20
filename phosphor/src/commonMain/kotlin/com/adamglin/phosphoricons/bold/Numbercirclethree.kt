package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) {
            return _numberCircleThree!!
        }
        _numberCircleThree = Builder(name = "NumberCircleThree", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(164.0f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -68.57f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.14f, -16.79f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 124.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.83f, -18.88f)
                lineTo(129.0f, 96.0f)
                lineTo(104.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.83f, 18.88f)
                lineToRelative(-18.34f, 26.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 164.0f, 152.0f)
                close()
            }
        }
        .build()
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
