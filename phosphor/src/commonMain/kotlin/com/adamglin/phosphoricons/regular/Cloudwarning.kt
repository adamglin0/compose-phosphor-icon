package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.CloudWarning: ImageVector
    get() {
        if (_cloudWarning != null) {
            return _cloudWarning!!
        }
        _cloudWarning = Builder(name = "CloudWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 40.0f)
                arcTo(88.09f, 88.09f, 0.0f, false, false, 81.29f, 88.67f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 72.0f, 216.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 0.0f, -176.0f)
                close()
                moveTo(160.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.29f, 0.11f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, 72.0f)
                close()
                moveTo(152.0f, 128.0f)
                lineTo(152.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(172.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 164.0f)
                close()
            }
        }
        .build()
        return _cloudWarning!!
    }

private var _cloudWarning: ImageVector? = null
