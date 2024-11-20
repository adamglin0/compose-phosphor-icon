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

public val ThinGroup.Blueprint: ImageVector
    get() {
        if (_blueprint != null) {
            return _blueprint!!
        }
        _blueprint = Builder(name = "Blueprint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 60.0f)
                lineTo(68.0f, 60.0f)
                lineTo(68.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 36.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 176.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(232.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(236.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 60.0f)
                close()
                moveTo(28.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 44.0f)
                lineTo(60.0f, 44.0f)
                lineTo(60.0f, 148.0f)
                lineTo(48.0f, 148.0f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, false, -20.0f, 8.42f)
                close()
                moveTo(228.0f, 196.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                lineTo(64.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(68.0f, 68.0f)
                lineTo(228.0f, 68.0f)
                close()
                moveTo(104.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 148.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.0f, 148.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(172.0f, 140.0f)
                lineTo(172.0f, 116.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(172.0f, 108.0f)
                lineTo(172.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineTo(132.0f, 108.0f)
                lineTo(132.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineTo(104.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(132.0f, 116.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(24.0f)
                lineTo(132.0f, 140.0f)
                close()
            }
        }
        .build()
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
