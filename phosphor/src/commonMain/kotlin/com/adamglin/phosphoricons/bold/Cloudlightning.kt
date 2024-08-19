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

public val BoldGroup.Cloudlightning: ImageVector
    get() {
        if (_cloudlightning != null) {
            return _cloudlightning!!
        }
        _cloudlightning = Builder(name = "Cloudlightning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 12.0f)
                arcTo(80.22f, 80.22f, 0.0f, false, false, 82.39f, 60.36f)
                arcTo(56.76f, 56.76f, 0.0f, false, false, 76.0f, 60.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, 112.0f)
                horizontalLineToRelative(30.81f)
                lineToRelative(-13.1f, 21.82f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 212.0f)
                horizontalLineToRelative(18.81f)
                lineToRelative(-13.1f, 21.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.58f, 12.35f)
                lineToRelative(24.0f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 188.0f)
                lineTo(125.19f, 188.0f)
                lineToRelative(9.6f, -16.0f)
                lineTo(156.0f, 172.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(156.0f, 148.0f)
                lineTo(76.0f, 148.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(0.28f)
                curveToRelative(-0.11f, 1.1f, -0.2f, 2.2f, -0.26f, 3.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 24.0f, 1.39f)
                arcTo(56.06f, 56.06f, 0.0f, true, true, 156.0f, 148.0f)
                close()
            }
        }
        .build()
        return _cloudlightning!!
    }

private var _cloudlightning: ImageVector? = null
