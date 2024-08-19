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

public val ThinGroup.Gendertransgender: ImageVector
    get() {
        if (_gendertransgender != null) {
            return _gendertransgender!!
        }
        _gendertransgender = Builder(name = "Gendertransgender", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(38.34f)
                lineTo(168.0f, 82.35f)
                lineTo(146.83f, 61.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.65f)
                lineTo(162.34f, 88.0f)
                lineToRelative(-21.17f, 21.18f)
                arcToRelative(68.16f, 68.16f, 0.0f, true, false, 5.65f, 5.66f)
                lineTo(168.0f, 93.67f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineTo(173.66f, 88.0f)
                lineTo(212.0f, 49.66f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(138.43f, 202.45f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 156.0f, 160.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 138.43f, 202.45f)
                close()
            }
        }
        .build()
        return _gendertransgender!!
    }

private var _gendertransgender: ImageVector? = null
