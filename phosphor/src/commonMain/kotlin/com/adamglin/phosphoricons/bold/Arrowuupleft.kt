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

public val BoldGroup.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) {
            return _arrowUUpLeft!!
        }
        _arrowUUpLeft = Builder(name = "ArrowUUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 144.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, 68.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                horizontalLineTo(61.0f)
                lineToRelative(27.52f, 27.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                lineTo(61.0f, 76.0f)
                horizontalLineTo(168.0f)
                arcTo(68.08f, 68.08f, 0.0f, false, true, 236.0f, 144.0f)
                close()
            }
        }
        .build()
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
