package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Hockey: ImageVector
    get() {
        if (_hockey != null) {
            return _hockey!!
        }
        _hockey = Builder(name = "Hockey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 154.0f)
                lineTo(130.0f, 154.0f)
                lineTo(36.57f, 44.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.14f, 7.77f)
                lineTo(161.0f, 209.07f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 171.7f, 214.0f)
                lineTo(224.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 168.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 154.0f)
                close()
                moveTo(170.18f, 201.3f)
                lineTo(140.18f, 166.0f)
                lineTo(194.0f, 166.0f)
                verticalLineToRelative(36.0f)
                lineTo(171.7f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 170.18f, 201.3f)
                close()
                moveTo(226.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(206.0f, 202.0f)
                lineTo(206.0f, 166.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(110.89f, 181.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, 0.68f)
                lineTo(85.82f, 201.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.52f, 0.7f)
                lineTo(62.0f, 202.0f)
                lineTo(62.0f, 166.0f)
                lineTo(85.2f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(32.0f, 154.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(84.3f, 214.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 95.0f, 209.07f)
                lineToRelative(16.6f, -19.54f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 110.89f, 181.08f)
                close()
                moveTo(30.0f, 200.0f)
                lineTo(30.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(50.0f, 166.0f)
                verticalLineToRelative(36.0f)
                lineTo(32.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 200.0f)
                close()
                moveTo(151.43f, 124.12f)
                lineTo(219.43f, 44.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.14f, 7.77f)
                lineToRelative(-68.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.14f, -7.77f)
                close()
            }
        }
        .build()
        return _hockey!!
    }

private var _hockey: ImageVector? = null
