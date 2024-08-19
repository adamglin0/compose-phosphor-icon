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

public val BoldGroup.Arrowelbowupright: ImageVector
    get() {
        if (_arrowelbowupright != null) {
            return _arrowelbowupright!!
        }
        _arrowelbowupright = Builder(name = "Arrowelbowupright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.49f, 88.49f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(187.0f, 92.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 68.0f)
                horizontalLineTo(187.0f)
                lineTo(159.51f, 40.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 224.49f, 88.49f)
                close()
            }
        }
        .build()
        return _arrowelbowupright!!
    }

private var _arrowelbowupright: ImageVector? = null
