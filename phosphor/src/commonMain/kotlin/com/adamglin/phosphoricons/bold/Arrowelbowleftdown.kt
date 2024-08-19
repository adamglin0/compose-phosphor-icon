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

public val BoldGroup.Arrowelbowleftdown: ImageVector
    get() {
        if (_arrowelbowleftdown != null) {
            return _arrowelbowleftdown!!
        }
        _arrowelbowleftdown = Builder(name = "Arrowelbowleftdown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(100.0f)
                verticalLineTo(187.0f)
                lineToRelative(27.51f, -27.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(76.0f, 187.0f)
                verticalLineTo(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 60.0f)
                horizontalLineTo(232.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 72.0f)
                close()
            }
        }
        .build()
        return _arrowelbowleftdown!!
    }

private var _arrowelbowleftdown: ImageVector? = null
