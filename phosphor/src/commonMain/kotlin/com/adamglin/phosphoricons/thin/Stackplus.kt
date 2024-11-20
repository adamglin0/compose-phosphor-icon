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

public val ThinGroup.StackPlus: ImageVector
    get() {
        if (_stackPlus != null) {
            return _stackPlus!!
        }
        _stackPlus = Builder(name = "StackPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(212.0f, 204.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 204.0f)
                lineTo(184.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(204.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 200.0f)
                close()
                moveTo(222.0f, 124.54f)
                lineTo(128.0f, 179.37f)
                lineTo(34.0f, 124.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 6.92f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, -6.92f)
                close()
                moveTo(28.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, -3.46f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.92f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 80.0f)
                close()
                moveTo(39.94f, 80.0f)
                lineTo(128.0f, 131.37f)
                lineTo(216.06f, 80.0f)
                lineTo(128.0f, 28.63f)
                close()
                moveTo(142.0f, 219.21f)
                lineToRelative(-14.0f, 8.16f)
                lineTo(34.0f, 172.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 6.92f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(16.0f, -9.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, -6.91f)
                close()
            }
        }
        .build()
        return _stackPlus!!
    }

private var _stackPlus: ImageVector? = null
