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

public val BoldGroup.Userlist: ImageVector
    get() {
        if (_userlist != null) {
            return _userlist!!
        }
        _userlist = Builder(name = "Userlist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(164.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 80.0f)
                close()
                moveTo(244.0f, 116.0f)
                lineTo(164.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(244.0f, 164.0f)
                lineTo(188.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(155.62f, 189.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.24f, 6.0f)
                curveToRelative(-5.72f, -22.23f, -28.24f, -39.0f, -52.38f, -39.0f)
                reflectiveCurveToRelative(-46.66f, 16.76f, -52.38f, 39.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.24f, -6.0f)
                curveToRelative(5.38f, -20.9f, 20.09f, -38.16f, 39.11f, -48.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 73.0f, 0.0f)
                curveTo(135.53f, 150.85f, 150.24f, 168.11f, 155.62f, 189.0f)
                close()
                moveTo(80.0f, 132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 132.0f)
                close()
            }
        }
        .build()
        return _userlist!!
    }

private var _userlist: ImageVector? = null
