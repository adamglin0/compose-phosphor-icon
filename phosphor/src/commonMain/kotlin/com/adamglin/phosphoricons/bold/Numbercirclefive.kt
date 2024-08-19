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

public val BoldGroup.Numbercirclefive: ImageVector
    get() {
        if (_numbercirclefive != null) {
            return _numbercirclefive!!
        }
        _numbercirclefive = Builder(name = "Numbercirclefive", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(122.17f, 92.0f)
                lineToRelative(-2.71f, 16.23f)
                arcTo(45.39f, 45.39f, 0.0f, false, true, 124.0f, 108.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f)
                arcToRelative(39.53f, 39.53f, 0.0f, false, true, -28.57f, -11.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.14f, -16.8f)
                arcTo(15.54f, 15.54f, 0.0f, false, false, 124.0f, 164.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                arcToRelative(15.54f, 15.54f, 0.0f, false, false, -11.43f, 4.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.16f, 126.0f)
                lineToRelative(8.0f, -48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
            }
        }
        .build()
        return _numbercirclefive!!
    }

private var _numbercirclefive: ImageVector? = null
