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

public val ThinGroup.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) {
            return _bulldozer!!
        }
        _bulldozer = Builder(name = "Bulldozer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 204.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(228.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(12.0f)
                lineTo(195.77f, 172.0f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, -33.06f, -31.89f)
                lineToRelative(-37.0f, -88.73f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 114.67f, 44.0f)
                lineTo(24.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 56.0f)
                verticalLineToRelative(97.41f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 40.0f, 212.0f)
                lineTo(160.0f, 212.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 35.77f, -32.0f)
                lineTo(220.0f, 180.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(118.36f, 54.46f)
                lineTo(154.0f, 140.0f)
                lineTo(60.0f, 140.0f)
                lineTo(60.0f, 52.0f)
                horizontalLineToRelative(54.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 118.36f, 54.46f)
                close()
                moveTo(24.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                verticalLineToRelative(88.0f)
                lineTo(40.0f, 140.0f)
                arcToRelative(35.76f, 35.76f, 0.0f, false, false, -20.0f, 6.08f)
                lineTo(20.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 52.0f)
                close()
                moveTo(160.0f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                lineTo(160.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
                moveTo(164.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(160.0f, 172.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 176.0f)
                close()
            }
        }
        .build()
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
