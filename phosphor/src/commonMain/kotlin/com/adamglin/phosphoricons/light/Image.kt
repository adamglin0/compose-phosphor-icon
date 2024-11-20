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

public val LightGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(40.0f, 54.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(218.0f, 163.57f)
                lineTo(188.53f, 134.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-21.42f, 21.42f)
                lineTo(101.9f, 110.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(38.0f, 154.2f)
                lineTo(38.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
                moveTo(38.0f, 200.0f)
                lineTo(38.0f, 171.17f)
                lineToRelative(52.58f, -52.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f)
                lineTo(176.83f, 202.0f)
                lineTo(40.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 200.0f)
                close()
                moveTo(216.0f, 202.0f)
                lineTo(193.8f, 202.0f)
                lineToRelative(-38.0f, -38.0f)
                lineToRelative(21.41f, -21.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(38.0f, 38.0f)
                lineTo(218.04f, 200.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f)
                close()
                moveTo(146.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 146.0f, 100.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
