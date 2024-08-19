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

public val FillGroup.Numbercircleone: ImageVector
    get() {
        if (_numbercircleone != null) {
            return _numbercircleone!!
        }
        _numbercircleone = Builder(name = "Numbercircleone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(140.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(124.0f, 95.0f)
                lineToRelative(-11.56f, 7.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.88f, -13.32f)
                lineToRelative(24.0f, -16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 80.0f)
                close()
            }
        }
        .build()
        return _numbercircleone!!
    }

private var _numbercircleone: ImageVector? = null
