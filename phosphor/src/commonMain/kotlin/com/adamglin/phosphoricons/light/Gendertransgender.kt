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

public val LightGroup.Gendertransgender: ImageVector
    get() {
        if (_gendertransgender != null) {
            return _gendertransgender!!
        }
        _gendertransgender = Builder(name = "Gendertransgender", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 34.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(33.52f)
                lineTo(168.0f, 79.52f)
                lineTo(148.24f, 59.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.49f)
                lineTo(159.52f, 88.0f)
                lineToRelative(-18.46f, 18.46f)
                arcToRelative(69.94f, 69.94f, 0.0f, true, false, 8.49f, 8.48f)
                lineTo(168.0f, 96.5f)
                lineToRelative(19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.49f)
                lineTo(176.48f, 88.0f)
                lineTo(210.0f, 54.49f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 34.0f)
                close()
                moveTo(137.0f, 201.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, true, 17.0f, -41.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 137.0f, 201.0f)
                close()
            }
        }
        .build()
        return _gendertransgender!!
    }

private var _gendertransgender: ImageVector? = null
