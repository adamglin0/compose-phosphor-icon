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

public val FillGroup.Yinyang: ImageVector
    get() {
        if (_yinyang != null) {
            return _yinyang!!
        }
        _yinyang = Builder(name = "Yinyang", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 80.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(140.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 176.0f)
                close()
                moveTo(172.0f, 84.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 81.09f, 202.42f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 128.0f, 128.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 172.0f, 84.0f)
                close()
            }
        }
        .build()
        return _yinyang!!
    }

private var _yinyang: ImageVector? = null
