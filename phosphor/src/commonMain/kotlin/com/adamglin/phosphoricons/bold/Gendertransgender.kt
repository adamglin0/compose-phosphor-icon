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

public val BoldGroup.Gendertransgender: ImageVector
    get() {
        if (_gendertransgender != null) {
            return _gendertransgender!!
        }
        _gendertransgender = Builder(name = "Gendertransgender", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 28.0f)
                horizontalLineTo(172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(15.0f)
                lineTo(168.0f, 71.0f)
                lineTo(152.49f, 55.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(151.0f, 88.0f)
                lineTo(140.58f, 98.46f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 17.0f, 17.0f)
                lineTo(168.0f, 105.0f)
                lineToRelative(15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(185.0f, 88.0f)
                lineToRelative(19.0f, -19.0f)
                verticalLineTo(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 28.0f)
                close()
                moveTo(132.77f, 196.8f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 148.0f, 160.0f)
                arcTo(52.05f, 52.05f, 0.0f, false, true, 132.77f, 196.8f)
                close()
            }
        }
        .build()
        return _gendertransgender!!
    }

private var _gendertransgender: ImageVector? = null
