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

public val BoldGroup.Hockey: ImageVector
    get() {
        if (_hockey != null) {
            return _hockey!!
        }
        _hockey = Builder(name = "Hockey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 148.0f)
                lineTo(132.75f, 148.0f)
                lineTo(41.14f, 40.23f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 22.86f, 55.77f)
                lineToRelative(95.16f, 112.0f)
                lineToRelative(0.06f, 0.07f)
                lineTo(156.46f, 213.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 171.7f, 220.0f)
                lineTo(224.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 168.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 148.0f)
                close()
                moveTo(153.15f, 172.0f)
                lineTo(180.0f, 172.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-6.45f)
                close()
                moveTo(220.0f, 196.0f)
                lineTo(204.0f, 196.0f)
                lineTo(204.0f, 172.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(153.66f, 112.23f)
                lineTo(214.86f, 40.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.28f, 15.54f)
                lineToRelative(-61.2f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.28f, -15.54f)
                close()
                moveTo(109.52f, 182.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.91f, 1.37f)
                lineTo(82.45f, 196.0f)
                lineTo(76.0f, 196.0f)
                lineTo(76.0f, 171.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 74.7f, 148.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(84.3f, 220.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 99.54f, 213.0f)
                lineToRelative(11.35f, -13.36f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 109.52f, 182.68f)
                close()
                moveTo(36.0f, 172.0f)
                lineTo(52.0f, 172.0f)
                verticalLineToRelative(24.0f)
                lineTo(36.0f, 196.0f)
                close()
            }
        }
        .build()
        return _hockey!!
    }

private var _hockey: ImageVector? = null
