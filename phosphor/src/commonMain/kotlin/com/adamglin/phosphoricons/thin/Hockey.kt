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

public val ThinGroup.Hockey: ImageVector
    get() {
        if (_hockey != null) {
            return _hockey!!
        }
        _hockey = Builder(name = "Hockey", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 156.0f)
                lineTo(129.05f, 156.0f)
                lineToRelative(-94.0f, -110.59f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 29.0f, 50.59f)
                lineTo(162.56f, 207.77f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 171.7f, 212.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 156.0f)
                close()
                moveTo(168.65f, 202.59f)
                lineTo(135.85f, 164.0f)
                lineTo(196.0f, 164.0f)
                verticalLineToRelative(40.0f)
                lineTo(171.7f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 168.65f, 202.59f)
                close()
                moveTo(228.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(204.0f, 204.0f)
                lineTo(204.0f, 164.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(104.0f, 183.06f)
                lineToRelative(-16.6f, 19.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.41f)
                lineTo(60.0f, 204.0f)
                lineTo(60.0f, 164.0f)
                lineTo(85.2f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(32.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(84.3f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.14f, -4.23f)
                lineToRelative(16.61f, -19.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.1f, -5.18f)
                close()
                moveTo(28.0f, 200.0f)
                lineTo(28.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(52.0f, 164.0f)
                verticalLineToRelative(40.0f)
                lineTo(32.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 200.0f)
                close()
                moveTo(153.41f, 131.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.46f, -5.64f)
                lineToRelative(68.0f, -80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.1f, 5.18f)
                lineToRelative(-68.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.64f, 0.46f)
                close()
            }
        }
        .build()
        return _hockey!!
    }

private var _hockey: ImageVector? = null
