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

public val BoldGroup.Simcard: ImageVector
    get() {
        if (_simcard != null) {
            return _simcard!!
        }
        _simcard = Builder(name = "Simcard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.49f, 79.51f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.51f)
                close()
                moveTo(196.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(87.0f)
                lineToRelative(49.0f, 49.0f)
                close()
                moveTo(88.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(180.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(100.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(36.0f)
                lineTo(100.0f, 172.0f)
                close()
                moveTo(156.0f, 172.0f)
                lineTo(140.0f, 172.0f)
                lineTo(140.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _simcard!!
    }

private var _simcard: ImageVector? = null
