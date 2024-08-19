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

public val ThinGroup.Callbell: ImageVector
    get() {
        if (_callbell != null) {
            return _callbell!!
        }
        _callbell = Builder(name = "Callbell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 180.0f)
                lineTo(232.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(220.0f, 172.0f)
                lineTo(220.0f, 152.0f)
                arcToRelative(92.11f, 92.11f, 0.0f, false, false, -88.0f, -91.91f)
                lineTo(132.0f, 36.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(104.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(124.0f, 60.09f)
                arcTo(92.11f, 92.11f, 0.0f, false, false, 36.0f, 152.0f)
                verticalLineToRelative(20.0f)
                lineTo(24.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(44.0f, 152.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 168.0f, 0.0f)
                verticalLineToRelative(20.0f)
                lineTo(44.0f, 172.0f)
                close()
                moveTo(236.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(24.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(232.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 208.0f)
                close()
            }
        }
        .build()
        return _callbell!!
    }

private var _callbell: ImageVector? = null
