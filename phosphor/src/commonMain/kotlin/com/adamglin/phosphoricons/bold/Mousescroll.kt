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

public val BoldGroup.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) {
            return _mouseScroll!!
        }
        _mouseScroll = Builder(name = "MouseScroll", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 12.0f)
                lineTo(112.0f, 12.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 44.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f)
                lineTo(212.0f, 80.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 144.0f, 12.0f)
                close()
                moveTo(188.0f, 176.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(112.0f, 220.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(68.0f, 80.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f)
                close()
                moveTo(140.0f, 93.0f)
                lineTo(140.0f, 163.0f)
                lineToRelative(3.51f, -3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(116.0f, 163.0f)
                lineTo(116.0f, 93.0f)
                lineToRelative(-3.51f, 3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
