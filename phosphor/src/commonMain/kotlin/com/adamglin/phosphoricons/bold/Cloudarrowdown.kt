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

public val BoldGroup.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) {
            return _cloudArrowDown!!
        }
        _cloudArrowDown = Builder(name = "CloudArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.49f, 167.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(140.0f, 179.0f)
                verticalLineTo(128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(51.0f)
                lineToRelative(11.51f, -11.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.49f, 167.51f)
                close()
                moveTo(160.0f, 36.0f)
                arcTo(92.08f, 92.08f, 0.0f, false, false, 79.0f, 84.37f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 72.0f, 220.0f)
                horizontalLineTo(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -1.81f, -87.95f)
                arcTo(91.7f, 91.7f, 0.0f, false, false, 68.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                arcToRelative(67.27f, 67.27f, 0.0f, false, true, -7.25f, 30.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.42f, 10.82f)
                arcTo(91.08f, 91.08f, 0.0f, false, false, 252.0f, 128.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 160.0f, 36.0f)
                close()
            }
        }
        .build()
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
